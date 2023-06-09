import java.util.*;
public class singli_linkedlist {
    // singli_linkedlist node;
    class node{
        int data;
        node n;
        node(int d){
            data = d;
            n = null;
        }
    }
    node head=null;
    Scanner p = new Scanner(System.in);
        void insert_f(int val){
            node tem = new node(val);
            if(head==null){
                head = tem;
            }
            else{
                tem.n=head;
                head=tem;
            }
            // System.out.println();
        }

        void insert_l(int val){
            node tem= new node(val);
            if(head==null){
                 head=tem;
            }
            else{
                node i = head;
                while(i.n!=null){
                    i = i.n;
                }
                i.n=tem;
                tem.n=null;
            }
            System.out.println();
        }

        void show(){
            if(head==null){
                System.out.println("LIST IS EMPTY .");
            }
            else{
                node i = head;
                while(i!=null){
                    System.out.print(i.data+"-->");
                    i=i.n;
                }
            }
            System.out.println();
        }

        void delete_f(){
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                node i = head;
                head=i.n;
                i.n=null;
            }
        }

        void delete_l(){
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                if(head.n==null){
                    head=null;
                }else{
                    node i =head;
                    node j=i;
                    while(i.n!=null){
                        j=i;
                        i=i.n;
                    }
                    j.n=null;
                }
            }
        }

        void insert_random(int val){
            System.out.println();
            if(head==null){
                System.out.println("List is empty so, -");
                insert_f(val);
            }
            else{
                node tem = new node(val);
                System.out.print("Enter the POSITION to insert : ");
                int po= p.nextInt();
                if(po==0){
                    tem.n=head;
                    head=tem;
                }
                else{

                    int k=1;
                    node i= head;
                    while(k<po){
                        k++;
                        i=i.n;
                    }
                    if(i.n!=null){
                        tem.n=i.n;
                        i.n=tem;
                    }else{
                        tem.n=null;
                        i.n=tem;
                    }
                }
            }
            System.out.println();
        }

        void delete_random(){
            System.out.println();
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                System.out.print("Enter a the POSITION to DELETE : ");
                int po = p.nextInt();
                node i = head;
                if(po==1){
                    delete_f();
                }
                else{
                    node j = i;
                    int k=1;
                    while(k<po){
                        k++;
                        j=i;
                        i=i.n;
                    }
                    if(i.n==null){
                        j.n=null;
                    }
                    else{
                        j.n=i.n;
                    }
                }
            }
            System.out.println();
        }

        
        void search(){
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                System.out.print("Enter the number to SEARCH : ");
                int n1 = p.nextInt();
                int po=1,k=0;
                node i =head;
                while(i.data!=n1){
                    i=i.n;
                    po++;
                    if(i==null){
                        System.out.println();
                        System.out.println(n1+"--INVALID NUMBER");
                        System.out.println("Enter a valid Number.");
                        search();
                        k=1;
                        break;
                    }
                }
                if(k!=1){
                    System.out.println("The number "+i.data+" is at "+po+" POSITION");
                }
            }
        }
        node rev(node i){
            if(i.n==null){
                System.out.print(i.data+"-->");
                return i;
            }
            else{
                // i=i.n;
                rev(i.n);
                System.out.print(i.data+"-->");
                
            }
            return i;
        }
        void reverse(){
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                node i = head;
                System.out.println("REVERSED LIST : ");
                rev(i);
                System.out.println();
            }
        }

        void replace(){
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                System.out.print("Enter the value TO BE replace  : ");
                int v = p.nextInt();
                System.out.print("Enter the NEW value : ");
                int r= p.nextInt();
                node tem= new node(r);
                node i =head;
                node j=i;
                if(i.data==v){
                    tem.n=head.n;
                    head=tem;
                }
                else{
                    while(i.data!=v){
                        j=i;
                        i=i.n;
                    }
                    j.n=tem;
                    tem.n=i.n;
                }
                System.out.println("New List :");
                show();
            }
        }

        void acending(){
            node i=head;
            node j=i;
            int tem;
            System.out.println();
            for(i=head;i!=null;i=i.n){
                for(j=i;j!=null;j=j.n){
                    if(i.data>j.data){
                        tem = i.data;
                        i.data=j.data;
                        j.data=tem;
                    }
                }
                System.out.print(i.data+"-->");
            }
            System.out.println();
        }

        void decending(){
            node i=head;
            node j=i;
            int tem;
            System.out.println();
            for(i=head;i!=null;i=i.n){
                for(j=i;j!=null;j=j.n){
                    if(i.data<j.data){
                        tem = i.data;
                        i.data=j.data;
                        j.data=tem;
                    }
                }
                System.out.print(i.data+"-->");
            }
            System.out.println();
        }
        
        void sorting(){
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                System.out.println("\t1.Asecending order ");
                System.out.println("\t2.descending order ");
                System.out.print("Enter your choice : ");
                int c =p.nextInt();
                if(c==1){
                    acending();
                }
                else if(c==2){
                    decending();
                }
                else{
                    System.out.println("Enter valid Option.");
                    sorting();
                }
            }
        }
    }
    
    
    
    class linked{
    public static void main(String[] k){
        int c=1,val;
        Scanner sc = new Scanner(System.in);
        
        singli_linkedlist list  = new singli_linkedlist();
        while(c!=12){
            System.out.print("*-----------------------*");
            System.out.println("\n|\t1.insert_first\t|\n|\t2.insert_last\t|\n|\t3.delete_first\t|\n|\t4.delete_last\t|\n|\t5.show\t\t|\n|\t6.delete_random\t|\n|\t7.insert_random\t|\n|\t8.search\t|\n|\t9.sorting\t|\n|\t10.reverse\t|\n|\t11.replace\t|\n|\t12.exit\t\t|");
            System.out.println("*-----------------------*");
            System.out.print("Enter Your Choice : ");
            c = sc.nextInt();
            System.out.println();
            switch(c){
                case 1:
                System.out.print("enter the number to be inserted : ");
                val = sc.nextInt();
                list.insert_f(val);
                break;
            case 2:
                System.out.print("enter the number to be inserted : ");
                val = sc.nextInt();
                list.insert_l(val);
                break;
            case 3:
                list.delete_f();
                break;
            case 4:
                list.delete_l();
                break;
            case 5:
                 list.show();
                break;
            case 6:
                 list.delete_random();
                break;
            case 7:
                System.out.print("enter the number to be inserted : ");
                val = sc.nextInt();
                 list.insert_random(val);
                break;
            case 8:
                 list.search();
                break;
            case 9:
                 list.sorting();
                break;
            case 10:
                
                System.out.print(" ");
                 list.reverse();
                break;
            case 11:
                 list.replace();
                break;
            case 12:
                break;
            default:
                System.out.print("enter a valid number.");
       }
        }
        sc.close();
    
    }
}


//OUPUT
/*
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 1

enter the number to be inserted : 11
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 2

enter the number to be inserted : 12

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 2

enter the number to be inserted : 13

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 2

enter the number to be inserted : 14

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 2

enter the number to be inserted : 15

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 1

enter the number to be inserted : 5
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

5-->11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 3

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 4

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

11-->12-->13-->14-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 2

enter the number to be inserted : 15

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 6


Enter a the POSITION to DELETE : 1

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 7

enter the number to be inserted : 11

Enter the POSITION to insert : 0

*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 8

Enter the number to SEARCH : 12
The number 12 is at 2 POSITION
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 9

        1.Asecending order
        2.descending order
Enter your choice : 1

11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 9

        1.Asecending order
        2.descending order
Enter your choice : 2

15-->14-->13-->12-->11-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 5

15-->14-->13-->12-->11-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 10

 REVERSED LIST :
11-->12-->13-->14-->15-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 11

Enter the value TO BE replace  : 11
Enter the NEW value : 1
New List :
15-->14-->13-->12-->1-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 11

Enter the value TO BE replace  : 15
Enter the NEW value : 5
New List :
5-->14-->13-->12-->1-->
*-----------------------*
|       1.insert_first  |
|       2.insert_last   |
|       3.delete_first  |
|       4.delete_last   |
|       5.show          |
|       6.delete_random |
|       7.insert_random |
|       8.search        |
|       9.sorting       |
|       10.reverse      |
|       11.replace      |
|       12.exit         |
*-----------------------*
Enter Your Choice : 12*/
