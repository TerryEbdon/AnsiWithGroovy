import org.fusesource.jansi.Ansi
import org.fusesource.jansi.AnsiConsole

import static org.fusesource.jansi.Ansi.Color.*
import static org.fusesource.jansi.Ansi.ansi

/**
 * A simple Hello World application demonstrating the use of Jansi library
 * for ANSI color output in Groovy.
 */
class HelloWorld {
    static void main(String[] args) {
        // Initialize Jansi console support
        AnsiConsole.systemInstall()
        
        try {
            // Print "Hello World" with different colors and styles
            println ansi().fg(GREEN).a("Hello ").fg(BLUE).bold().a("World").boldOff().a("!").reset()
            
            // Demonstrate different color combinations
            println ansi().fg(RED).a("This is red text").reset()
            println ansi().fg(YELLOW).a("This is yellow text").reset()
            println ansi().fg(CYAN).a("This is cyan text").reset()
            println ansi().fg(MAGENTA).a("This is magenta text").reset()
            
            // Demonstrate background colors
            println ansi().bg(BLUE).fg(WHITE).a(" Blue background with white text ").reset()
            
            // Demonstrate bold and underline
            println ansi().bold().a("This is bold text").reset()
            println ansi().a("Normal text with ").bold().a("bold").boldOff().a(" in the middle").reset()
            
        } finally {
            // Clean up Jansi console support
            AnsiConsole.systemUninstall()
        }
    }
}
