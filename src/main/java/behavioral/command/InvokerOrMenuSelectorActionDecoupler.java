package behavioral.command;

/* Toolkit or Framework is written, this is generic button */
public class InvokerOrMenuSelectorActionDecoupler {

    /* Decouples invoker and command implementor */
    public boolean executeCommandReturnCallback(ICommand command) {
        command.execute();
        return true;
    }

    /*
    A simple user action is converted to programming language entity - object (How ??)
    Once this happens, it is in application control.
     */
    public static void main(String[] args) {

        /* Decouples Invoker from MyCommands with Interface - HTML to JS Toolkit */

        // Represents resource
        String identifier = "name";

        /* Inner - Decouples MyCommands from Resource - JS generic to domain specific toolkit */
        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel = new ReceiverOrServerOrDocument(identifier);
        InvokerOrMenuSelectorActionDecoupler invokerOrMenuSelectorActionDecoupler = new InvokerOrMenuSelectorActionDecoupler();

        // Implementor of Interface within Toolkit
        CommandsClassDependency.MyOpenCommand openCommand = new CommandsClassDependency.MyOpenCommand(iDomainCommandDependencyAtClassLevel);
        CommandsClassDependency.MyUndoCommand undoCommand = new CommandsClassDependency.MyUndoCommand(iDomainCommandDependencyAtClassLevel);
        CommandsClassDependency.MyRedoCommand redoCommand = new CommandsClassDependency.MyRedoCommand(iDomainCommandDependencyAtClassLevel);
        CommandsClassDependency.MyMacroCenterAtNormalSizeCommand macroCommand =
                new CommandsClassDependency.MyMacroCenterAtNormalSizeCommand(iDomainCommandDependencyAtClassLevel);

        // Represents user selection in the browser
        boolean openThen = invokerOrMenuSelectorActionDecoupler.executeCommandReturnCallback(openCommand);
        boolean undoThen = invokerOrMenuSelectorActionDecoupler.executeCommandReturnCallback(undoCommand);
        boolean redoThen = invokerOrMenuSelectorActionDecoupler.executeCommandReturnCallback(redoCommand);
        boolean centerThen = invokerOrMenuSelectorActionDecoupler.executeCommandReturnCallback(macroCommand);
    }
}
