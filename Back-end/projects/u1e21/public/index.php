<?php
    declare(strict_types = 1);
?>

<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Strings</title>
    </head>

    <body>
        <?php
            function capitalizeString(mixed $stringToCapitalize) : string
            {
                if (gettype($stringToCapitalize) !== 'string')
                {
                    return $stringToCapitalize . ' is not a string!';
                }

                return empty($stringToCapitalize) ? 'The string is empty' : strtoupper($stringToCapitalize);
            }
        ?>

        <p><?= capitalizeString(5) ?></p>
        <p><?= capitalizeString('') ?></p>
        <p><?= capitalizeString('The Roman Empire was a state that dominated the Mediterranean and much of Europe, Western Asia, and North Africa during the classical period. The Roman Republic had previously conquered most of these territories, which later came under permanent single-person rule following Octavian\'s rise to power and the establishment of the Augustan Principate in 27 BC. By the late 3rd century AD, the empire had been divided many times. The Western Roman Empire collapsed in 476 AD, whereas the Eastern Roman Empire (also known as the Byzantine Empire) persisted until the fall of Constantinople in 1453.

        By 100 BC, the city of Rome had expanded its rule from the Italian peninsula to most of the Mediterranean and beyond. However, it was severely destabilised by civil wars and political conflicts, which culminated in the victory of Octavian over Mark Antony and Cleopatra at the Battle of Actium in 31 BC, and the subsequent conquest of the Ptolemaic Kingdom in Egypt. In 27 BC, the Roman Senate granted Octavian overarching military power (imperium) and the new title of Augustus, marking his accession as the first Roman emperor. The vast Roman territories were organized into senatorial provinces, governed by proconsuls who were appointed by lot annually, and imperial provinces, which belonged to the emperor but were governed by legates.

        The first two centuries of the Empire saw unprecedented stability and prosperity known as the Pax Romana (lit. \'Roman Peace\'). Rome reached its greatest territorial extent under Trajan (r. 98–117 AD), but increasing trouble and decline began under Commodus (r. 180–192). In the 3rd century, the Empire underwent a 50-year crisis that threatened its existence due to civil war, plagues and barbarian invasions. The Gallic and Palmyrene empires broke away and a series of short-lived emperors led the Empire, which was later reunified under Aurelian (r. 270–275). The civil wars ended with the victory of Diocletian (r. 284–305), who set up two different imperial courts in the Greek East and Latin West. Constantine the Great (r. 306–337), the first Christian emperor, moved the imperial seat from Rome to Byzantium in 330, and renamed it Constantinople. The Migration Period, involving large invasions by Germanic peoples and the Huns, led to the decline of the Western Roman Empire. With the fall of Ravenna to the Germanic Herulians and the deposition of Romulus Augustus in 476 by Odoacer, the Western Empire finally collapsed. The Byzantine (Eastern Roman) Empire survived for another millennium with Constantinople as its sole capital, until the city\'s fall in 1453.[k]

        Due to the Empire\'s extent and endurance, its institutions and culture had a lasting influence on the development of language, religion, art, architecture, literature, philosophy, law, and forms of government across its territories. The rediscovery of classical science and technology (which formed the basis for Islamic science) in medieval Europe contributed to the Scientific Renaissance and Scientific Revolution. Rome\'s republican institutions have influenced the Italian city-state republics of the medieval period, the early United States, and modern democratic republics.') ?></p>
    </body>
</html>