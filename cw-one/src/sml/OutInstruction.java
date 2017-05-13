package sml;

/**
 * Created by stevenjenkins on 19/03/2017.
 */
public class OutInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int result) {
        this(label, "out");
        this.result = result;

    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(result);
        System.out.println("value of register " + result + " is " + value1);
    }

    @Override
    public String toString() {

        return super.toString() + " print register " + result;
    }
}
