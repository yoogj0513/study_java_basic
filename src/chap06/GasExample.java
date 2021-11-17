package chap06;

public class GasExample {
    public static void main(String[] args) {
        Gas myGas = new Gas();

        myGas.setGas(5);

        boolean gasState = myGas.isLeftGas();
        if (gasState) {
            System.out.println("출발합니다.");
            myGas.run();
        }

        if (myGas.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
