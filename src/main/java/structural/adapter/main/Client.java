package structural.adapter.main;

public class Client {
    IDomainSpecificTarget target;
    public Client(IDomainSpecificTarget target) {
        this.target = target;
    }

    public int getFirstNumber(Integer[] numbers) {
        return this.target.getFirstNumber(numbers);
    }
    public static void main(String[] args) {
        IDomainSpecificTarget target = new Adapter();
        final Client client = new Client(target);
        Integer[] numbers = new Integer[]{4, 1, 7};
        System.out.println(client.getFirstNumber(numbers));
    }
}

