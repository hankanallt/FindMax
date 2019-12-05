
package findmax;


public class FindMax {

    
    public static void main(String[] args) {
        
       
findMax(3, 56, 6, 99, 67);
}

private static void findMax(int a, int b, int c, int d, int e) {
    
int max = a;
if (b > max) {
max=b;
}
if (c > max) {
max = c;
}
if (d > max) {
max = d;
}
if (e > max) {
max = e;
}


System.out.println(max);
}

}
   