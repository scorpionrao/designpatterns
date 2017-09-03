package creational.factorymethod.motivation;

public class SpecialProduct extends Product {

    int identifier;
    int instanceVar1;

    SpecialProduct() {
        open();
    }

    static void saveIdentifier() {
        // write identifier to DB first
    }

    static void saveInstanceVar() {
        // write instance variables to DB next
    }

    static int readIdentifier() {
        int someIdentifier = 56;
        return someIdentifier;
    }

    static void readInstanceVarFromS3() {
        // read instance variables to DB next
    }

    static void readInstanceVarFromDB() {
        // read instance variables to DB next
    }

    void open() {
        int someIdentifier = SpecialProduct.readIdentifier();
        if(someIdentifier == 56) {
            SpecialProduct.readInstanceVarFromS3();
        } else {
            SpecialProduct.readInstanceVarFromDB();
        }
        // populate instances variables
    }
    void close() {}
    void save() {
        SpecialProduct.saveIdentifier();
        SpecialProduct.saveInstanceVar();
    }
    void revert() {}
}
