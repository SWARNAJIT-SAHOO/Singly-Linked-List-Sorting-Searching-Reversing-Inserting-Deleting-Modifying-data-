#include <stdio.h>
#include<stdlib.h>

struct node{
    int d; 
    struct node* n;
};
struct node* head =NULL;

void insert_f(int val){
    struct node* tem = (struct node*)malloc(sizeof(struct node));
    tem->n=NULL;
    tem->d=val;
    if(head==NULL){
        head = tem;
    }
    else{
        // struct node* i= head;
        tem->n=head;
        head=tem;
    }
}
void insert_l(int val){
    struct node* tem =(struct node*)malloc(sizeof(struct node));
    tem->d=val;
    tem->n=NULL;
    if(head==NULL){
        head=tem;
    }
    else{
        struct node*i=head;
        while(i->n!=NULL){
            i=i->n;
        }
        i->n=tem;
    }
}
void insert_random(int val){
        struct node* tem= (struct node*)malloc(sizeof(struct node));
        tem->d=val;
        tem->n=NULL;
    if(head==NULL){
        head=tem;
    }
    else{
        int po,j=1;
        struct node*i= head;
        printf("enter the position to insert the value: ");
        scanf("%d",&po);
        if(po==0){
        	tem->n=i;
        	head=tem;
		}else{
        while(j<po){
            i=i->n;
            j++;
        }
        tem->n=i->n;
        i->n=tem;
    }
    }
}

void delete_f(){
    if(head==NULL){
        printf("list is empty.");
    }
    else{
        struct node*i=head;
        head=i->n;
        free(i);
    }
}
void delete_l(){
    if(head==NULL){
        printf("list is empty.");
    }
    else{
        struct node*i=head;
        struct node *tem;
        while(i->n!=NULL){
        	tem=i;
            i=i->n;
        }  
        tem->n=NULL;
        free(i);
    }
}
void delete_random(){
    if(head==NULL){
        printf("List is empty.");
    }
    else{
        int j=1;
        int po;
		printf("enter the position to be deleted : ");
		scanf("%d",&po);
        struct node* i =head;
        struct node* tem;
        if(po==0){
            head = i->n;
            i->n=NULL;
            free(i);
        }
        else{
            
        while(j<po){
            i=i->n;
            j++;
        }
        tem=i->n;
        i->n=tem->n;
        // i->n = tem->n;
        free(tem);
        }
    }
}
void  search(){
    if(head==NULL){
        printf("List is empty.");
    }
    else{
        int s,j=1,k=0;
        printf("Enter the Number to be Searched : ");
        scanf("%d",&s);
        struct node*i =head;
        while( i!=NULL){ //i!=NULL beacause even if the pointer value of 'i' became null it can enter the loop.but i->n!=NULL cannot enter the loop inorder to print
            if(i->d==s){
            	printf("The number %d is At %d Position.",s,j);
            	k++;
			}
            j++;
            i=i->n;
            
        }
        if(k==0){
            printf("The number %d is Not in the LIST.",s);
        }
        
    }
}
void ascending(struct node* i,struct node*j,int tem){
   while(i!=NULL){
            j=i->n;
            while(j!=NULL){
                if(i->d > j->d){
                    tem=i->d;
                    i->d=j->d;
                    j->d=tem;
                }
                j=j->n;
            }
            printf("%d-->",i->d);
            i=i->n;
        }
}

void desending(struct node* i,struct node*j,int tem){
   while(i!=NULL){
            j=i->n;
            while(j!=NULL){
        
                if(i->d < j->d){
                    tem=i->d;
                    i->d=j->d;
                    j->d=tem;
                }
                j=j->n;
            }
            printf("%d-->",i->d);
            i=i->n;
        }
}
void sorting(){
    if(head==NULL){
        printf("List is Empty.");
    }
    else{
        struct node* i =head; 
        // struct node* k =head;
        struct node* j=head;
         int tem,o;
        printf("\nEnter - 1.Ascending Order\n\t2.Descending Order");
        printf("\nenter your choice : ");
        scanf("%d",&o);
        if(o==1){
            ascending(i,j,tem);
        }
        else if(o==2){
            desending(i,j,tem);
        }
        else{
            printf("enter a valid option.");
            sorting();
        }
        /* OR
       for(i=head;i!=NULL;i=i->n){
           for(j=i->n;j!=NULL;j=j->n){
               if(i->d > j->d){
                    tem=i->d;
                    i->d=j->d;
                    j->d=tem;
                }
           }
           printf("%d-->",i->d);
       }*/
    }
}
struct node* reverse(struct node*i){
        
		if(i->n==NULL){
			printf("%d-->",i->d);
			return i;
		}
		  //  printf("%d-->",i->d);
            reverse(i->n);
            printf("%d-->",i->d);
//        }
    
}

void show(){
    if(head==NULL){
        printf("List is empty.");
    }
    else{
        struct node* i =head;
        while(i!=NULL){ //if i write i->n!=NULL then when the null arrive then 'i' will hold the last but but it can't print beacause it cannot enter the while loop for printing.
            printf("%d-->",i->d);
            i=i->n;
        }
    }
}
void replace(){
    int val,r;
    if(head==NULL){
        printf("\nsince, List is empty");
        printf("\nenter a element to insert : ");
        scanf("%d",&val);
        insert_f(val);
        printf("\nInserted value in list : ");
        show();
    }
    else{
        printf("\nenter the value to be replaced : ");
        scanf("%d",&val);
        printf("enter the new value : ");
        scanf("%d",&r);
        
        struct node*tem = (struct node* )malloc(sizeof(struct node));
        tem->d=r;
        tem->n=NULL;
        
        struct node* i =head;
        struct node* j= head;
        if (i->d==val){
             tem->n=i->n;
             head= tem;
        }
        else{
        while(i!=NULL){
            if(i->d==val){
                tem->n=i->n;
                j->n=tem;
                break; //to stop after the first occurance
            }
            j=i;
            i=i->n;
        }
        }
    }
}

int main() {
   int c,val;
   while(c!=12){
       printf("\n1.insert_first\n2.insert_last\n3.delete_first\n4.delete_last\n5.show\n6.delete_random\n7.insert_random\n8.search\n9.sorting\n10.reverse\n11.replace\n12.exit\n");
       printf("Enter your choice : ");
       scanf("%d",&c);
switch(c){
           case 1:
                printf("enter the number to be inserted : ");
                scanf("%d",&val);
                insert_f(val);
                break;
            case 2:
                printf("enter the number to be inserted : ");
                scanf("%d",&val);
                insert_l(val);
                break;
            case 3:
                delete_f();
                break;
            case 4:
                delete_l();
                break;
            case 5:
                show();
                break;
            case 6:
                delete_random();
                break;
            case 7:
                printf("enter the number to be inserted : ");
                scanf("%d",&val);
                insert_random(val);
                break;
            case 8:
                search();
                break;
            case 9:
                sorting();
                break;
            case 10: 
                printf(" ");
                struct node* i= head;
                reverse(i);
                break;
            case 11:
                replace();
                break;
            case 12:
                break;
            default:
                printf("enter a valid number.");
       }
   }
}
