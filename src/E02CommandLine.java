
public class E02CommandLine {

    /*
     * Example to print out command line arguments passed to the program.
     * In order to pass command line arguments to the program, select the
     * program you want to run, click 'Run' on the top menu, then 'Run
     * Configurations' then click on the arguments tab, and in the space
     * for 'program arguments' write out your list of arguments. Each
     * argument should be separated by a space.
     */
    public static void main(String[] whatever) {
        System.out.println("Command line arguments");
        for (int i = 0; i < whatever.length; i++) {
            System.out.println("args[" + i + "] = " + whatever[i]);
        }

    }

}
