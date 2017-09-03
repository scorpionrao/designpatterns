package behavioral.command;

public class CommandsClassDependency {

    public static class MyUndoCommand implements ICommand {

        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel;
        MyUndoCommand(IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel) {
            this.iDomainCommandDependencyAtClassLevel = iDomainCommandDependencyAtClassLevel;
        }

        /* Encapsulates concrete method in the receiver */
        @Override
        public void execute() {
            iDomainCommandDependencyAtClassLevel.performUndo();
        }
    }

    public static class MyRedoCommand implements ICommand {

        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel;
        MyRedoCommand(IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel) {
            this.iDomainCommandDependencyAtClassLevel = iDomainCommandDependencyAtClassLevel;
        }

        /* Encapsulates concrete method in the receiver */
        @Override
        public void execute() {
            iDomainCommandDependencyAtClassLevel.performRedo();
        }
    }

    public static class MyOpenCommand implements ICommand {

        /* How to open existing document */
        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel;
        MyOpenCommand(IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel) {
            this.iDomainCommandDependencyAtClassLevel = iDomainCommandDependencyAtClassLevel;
        }

        /* How to create a new document */
        Application application;
        MyOpenCommand(Application application) {
            this.application = application;
        }

        /* Encapsulates concrete method in the receiver */
        @Override
        public void execute() {
            if(iDomainCommandDependencyAtClassLevel == null) {
                String name = application.askUserForName();
                ReceiverOrServerOrDocument receiverOrServerOrDocument = new ReceiverOrServerOrDocument(name);
                application.addDocument(receiverOrServerOrDocument);
                receiverOrServerOrDocument.performOpen();
            } else {
                iDomainCommandDependencyAtClassLevel.performOpen();
            }
        }
    }

    public static class MyCenterCommand implements ICommand {

        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel;
        MyCenterCommand(IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel) {
            this.iDomainCommandDependencyAtClassLevel = iDomainCommandDependencyAtClassLevel;
        }

        /* Encapsulates concrete method in the receiver */
        @Override
        public void execute() {
            iDomainCommandDependencyAtClassLevel.center();
        }
    }

    public static class MyNormalSizeCommand implements ICommand {

        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel;
        MyNormalSizeCommand(IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel) {
            this.iDomainCommandDependencyAtClassLevel = iDomainCommandDependencyAtClassLevel;
        }

        /* Encapsulates concrete method in the receiver */
        @Override
        public void execute() {
            iDomainCommandDependencyAtClassLevel.normalSize();
        }
    }

    public static class MyMacroCenterAtNormalSizeCommand implements ICommand {

        IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel;
        ICommand centerCommand;
        ICommand normalSizeCommand;
        MyMacroCenterAtNormalSizeCommand(IDomainCommandDependencyAtClassLevel iDomainCommandDependencyAtClassLevel) {
            this.iDomainCommandDependencyAtClassLevel = iDomainCommandDependencyAtClassLevel;
            centerCommand = new MyCenterCommand(iDomainCommandDependencyAtClassLevel);
            normalSizeCommand = new MyNormalSizeCommand(iDomainCommandDependencyAtClassLevel);
        }

        /* Encapsulates concrete method in the receiver */
        @Override
        public void execute() {
            centerCommand.execute();
            normalSizeCommand.execute();
        }
    }

    public static class MySimpleCommand<T extends ReceiverOrServerOrDocument> implements ICommand {

        T t;

        public void set(T t) {
            this.t = t;
        }

        /* Encapsulates concrete method in the receiver */
        public void execute() {
            t.performUndo();
        }
    }

}
