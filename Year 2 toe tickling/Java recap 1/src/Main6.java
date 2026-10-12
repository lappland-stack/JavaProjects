/*
I lowkey got nothing to add, i genuinely tiered man


the program is supposed to output this:
*
**
***
****
*****
****
***
**
*

stack overflow to the rescue, good thing other people did this before me, but overall simple, i cannot fathom how i could overcomplicate it rn tbh

@Author David/Rofleemo
@Version 1.0
 */


class Main6 {
    public static void main(String[] args) {

        // Increasing
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Decreasing
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
