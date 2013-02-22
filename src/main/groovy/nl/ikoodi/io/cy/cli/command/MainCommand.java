package nl.ikoodi.io.cy.cli.command;

import com.beust.jcommander.Parameter;

public class MainCommand {

    @Parameter(
            names = {
                    "--help"
                    , "-h"
            }
            , help = true
    )
    private boolean help = false;

    public boolean isHelp() {
        return help;
    }
}
