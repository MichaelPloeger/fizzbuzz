package FizzBuzz;

public class FizzBuzz {
    int max;

    public  FizzBuzz(int max)
    {
        this.max = max;
        }
        public void print(){


            for (int i = 1; i <= max; i++) {
                int getal1 = 3;
                int getal2 = 5;
                String uitslag = "";

                if(i % (getal1*getal2) == 0){
                    uitslag = "FizzBuzz";
                }
                else if(i % getal2 == 0){
                    uitslag = "Buzz";
                }
                else if(i % getal1 == 0){
                    uitslag = "Fizz";
                }
                if(uitslag == ""){
                    System.out.println(i);
                }else{
                    System.out.println(uitslag);
                }


            }

    }

    public static void main(String[] args) {
        int max = 123;
        FizzBuzz f1 = new FizzBuzz(max);
        f1.print();
    }
}

