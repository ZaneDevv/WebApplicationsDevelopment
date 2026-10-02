<?php

declare(strict_types = 1);

// ---------------------------------
// CONSTANTS
// ---------------------------------

define('ANIMALS_AMOUNT', random_int(20, 30));

define('MINIMUM_UNICODE', 128000);
define('MAXIMUM_UNICODE', 128060);

define('ENCODING', 'UTF-8');

// ---------------------------------
// VARIABLES
// ---------------------------------

$animals = range(1, ANIMALS_AMOUNT);

// ---------------------------------
// METHODS
// ---------------------------------

/**
 * Generates the animals in the array
 * 
 * @author Álvaro Fernández Barrero
 */
function generateAnimals()
{
    global $animals;

    $animals = array_map(
        fn () : int => random_int(MINIMUM_UNICODE, MAXIMUM_UNICODE),
        $animals
    );
}

/**
 * Picks a random animal code from the array
 * 
 * @param int &$index Picked animal's index
 * @param int &$animalCode Picked animal's code
 * 
 * @author Álvaro Fernández Barrero
 */
function pickRandomAnimal(int &$index, int &$animalCode)
{
    global $animals;

    $index = array_rand($animals);
    $animalCode = $animals[$index];
}

/**
 * Removes the given entity from the array
 * 
 * @param int $entity Entity to remove from the animals array
 * 
 * @author Álvaro Fernández Barrero
 */
function removeAnimal(int $entity)
{
    global $animals;
    $animals = array_diff($animals, [$entity]);
}

/**
 * Prints all the animals in the array formatted properly to render the emoji itself in lieu of the number code
 * 
 * @author Álvaro Fernández Barrero
 */
function printAnimals()
{
    global $animals;

    $animalsToPrint = array_map(
        fn (int $element) : string => mb_chr($element, ENCODING) ?? '',
        $animals
    );

    echo '<p>' . implode(' ', $animalsToPrint) . '</p>';
}

// ---------------------------------
// SETTING UP
// ---------------------------------

generateAnimals();

// ---------------------------------
// SHOWING ON SCREEN
// ---------------------------------

# Showing all animals
echo '<h2>We\'ve got ' . ANIMALS_AMOUNT . ' animals</h2>';
printAnimals();

# Picking random animal
$animalIndex = 0;
$animalEntity = 0;
pickRandomAnimal($animalIndex, $animalEntity);

echo '<h2>Animal to remove</h2>';
echo '<p>' . mb_chr($animalEntity) . '</p>';

# Removing animal
removeAnimal($animalEntity);

if (!empty($animals))
{
    echo '<h2>Animals left (' . count($animals) . '):</h2>';
    printAnimals();
}
else
{
    echo 'There is no more animals, we\'ve removed them all';
}