package com.lawshiga.tutorial;

import java.util.logging.Logger;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultiCatchBlock {
    // assumes the current class is called MyLogger
     Logger logger = Logger.getLogger(MultiCatchBlock.class.getName());

    public int getPlayerScore(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile)) ) {
            return Integer.parseInt(contents.nextLine());
        } catch (FileNotFoundException e) {
            logger.warning("Player file not found!");
            return 0;
        } catch (IOException e) {
            logger.warning("Player file wouldn't load!");
            return 0;
        } catch (NumberFormatException e) {
            logger.warning("Player file was corrupted!");
            return 0;
        }
    }
}
