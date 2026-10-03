<?php

declare(strict_types = 1);

// ----------------------------
// CONSTANTS
// ----------------------------

define('IMAGES_PATH_FROM_ROOT', './src/img');

// ----------------------------
// VARIABLES
// ----------------------------

$bRow = ['torre', 'caballo', 'alfil', 'rey', 'reina', 'alfil', 'caballo', 'torre'];
$nRow = ['torre', 'caballo', 'alfil', 'reina', 'rey', 'alfil', 'caballo', 'torre'];

// ----------------------------
// METHODS
// ----------------------------

/**
 * Gets the corresponding image according to the given coordinates in the chess board
 * 
 * @param int $row Row index where the piece is at. It starts from 0, not 1
 * @param int $column Column index where the piece is at. It starts from 0, not 1
 * 
 * @return ?string Image's path according to the given position
 * 
 * @author Álvaro Fernández Barrero
 */
function getImageByPosition(int $row, int $column) : ?string
{
    global $bRow, $nRow;

    $isUp = $row < 2;
    $isDown = $row > 5;

    if (!($isUp || $isDown))
        return null;

    $pieceColorSuffix = $isUp ? 'n' : 'b';
    $piecesRowArrayName = "{$pieceColorSuffix}Row";
    $pieceName = ($row === 1 || $row === 6) ? 'peon' : $$piecesRowArrayName[$column];

    return IMAGES_PATH_FROM_ROOT . "/$pieceName$pieceColorSuffix.png";
}