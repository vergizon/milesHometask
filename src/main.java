public class main {
    public static void main(String[] args) {
        int r = 20; //количество рублей, за которую начисляется 1 миля
        int miles; //количество начисленных миль за купленный билет
        int ticketCost = 858; //стоимость билета

        miles = ticketCost / r;

        System.out.println(miles);
    }

}

