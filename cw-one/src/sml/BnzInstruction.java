/**
 * Created by steven on 13/05/2017.
 */
package sml;

/**
 * Created by stevenjenkins on 19/03/2017.
 */
public class BnzInstruction extends Instruction{
    private int nextStatement;
    private int op1;


    public BnzInstruction(String label, String op) {
        super(label, op);
    }

    public BnzInstruction(String label, int op1, String nextStatement) {
        this(label, "bnz");
        String s = nextStatement;
        this.nextStatement = Integer.parseInt(s.substring(1,2));
        this.op1 = op1;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        //set the register back to 0 to stop infinite loop
        if (value1 != 0) {
            m.setPc(nextStatement);
        }

    }

    @Override
    public String toString() {
        return super.toString() + " If " + op1 + " != 0 then go to " + nextStatement;
    }
}
