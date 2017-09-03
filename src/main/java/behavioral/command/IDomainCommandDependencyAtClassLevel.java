package behavioral.command;

public interface IDomainCommandDependencyAtClassLevel {

    /* Decouples MyCommandObject and Domain action */
    void performUndo();
    void performRedo();
    void performOpen();
    void center();
    void normalSize();

}
