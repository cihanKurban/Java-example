public static void main(String[] args){
int input;
int c;
int a = 0;
int b = 1;
Scanner deger = new Scanner(System.in);
System.out.println("Bir sayı giriniz");
input = deger.nextInt();
for(int i =0;i <input;i++){
c = a+ b;
a = b;
b = c;
System.out.println(" " + a );
}
deger.close();
}
