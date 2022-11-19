package lekcijaCetri.majasDarbs;

public class Trissturis {

        double a = 0;
        double b = 0;
        double c = 0;

    public Trissturis (double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        Trissturis(){
            System.out.println("Aprekinat trissturi ar malam a, b, c...");
        }

        public void rekinatLaukumu(){
            System.out.println("Trisstura mala a: " + a);
            System.out.println("Trisstura mala b: " + b);
            System.out.println("Trisstura mala c: " + c);

            System.out.println("Trisstura laukums ir: " + (this.a + this.b + this.c));

        }

        public boolean vaiIrVienadmalu(){
            if (this.a == this.b && this.a == this.c && this.b == this.c){
                return true;
            } else {
                return false;
            }
        }


        public boolean vaiIrVienadsanu(){
            if (this.a == this.b || this.a == this.c || this.b == this.c){
                return true;
            } else {
                return false;
            }
        }

    }

