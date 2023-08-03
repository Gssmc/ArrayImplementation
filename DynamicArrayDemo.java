import java.util.Scanner;
class DynamicArrayDemo{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        DynamicArray<Integer> array=new DynamicArray<Integer>();
        int element,pos;
        while (true){
            System.out.println("\n---------List Menu----------\n");
            System.out.println("1.Insert at End");
            System.out.println("2.Display The List");
            System.out.println("3.Insert at specific position");
            System.out.println("4.Delect at specific position");
            System.out.println("5.Delect at end");
            System.out.println("6.Delect from beginning");
            System.out.println("7.insert at beginning");
            System.out.println("8.get");
            System.out.println("9.update");
            System.out.println("10.search");
            System.out.println("11.clear");
            System.out.println("12.contains");
            System.out.println("13.Exit");
            System.out.println("---------------------------------");
            System.out.println("Enter your choice:\t");
        
            int cho=input.nextInt();
            switch(cho){
                case 1:
                    System.out.println("Enter the data:\t");
                    element=input.nextInt();
                    array.append(element);
                    break;
                case 2:
                    array.disp();
                    break;
                case 3:
                    System.out.println("Enter the position:\t");
                    pos=input.nextInt();
                    System.out.println("Enter the element:\t");
                    element=input.nextInt();
                    array.insert(element,pos);
                    break;
                case 4:
                    System.out.println("Enter the position:\t");
                    pos=input.nextInt();
                    array.del(pos);
                    break;
                case 5:
                    array.delEnd();
                    break;
                case 6:
                    array.delBig();
                    break;
                case 7:
                    System.out.println("Enter the element:\t");
                    element=input.nextInt();
                    array.insertBig(element);
                    break;
                case 8:
                    System.out.println("Enter the position:");
                    pos=input.nextInt();
                    array.get(pos);
                    break;
                case 9:
                    System.out.println("Enter the position:");
                    pos=input.nextInt();
                    System.out.println("Enter the element the you going to update:");
                    element=input.nextInt();
                    array.update(pos,element);
                    break;
                case 10:
                    System.out.println("Enter the element that you want to search:");
                    element=input.nextInt();
                    array.search(element);
                    break;
                case 11:
                    array.clear();
                    break;
                case 12:
                    System.out.println("enter the element:");
                    element=input.nextInt();
                    array.contain(element);
                    break;
                    
                case 13:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid data");
        
                    
            }
            
        }
        
    }
}
