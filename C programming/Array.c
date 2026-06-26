#include<stdio.h>
    void Display(int arr[],int n){
        int i ;
        printf("Array element : ");
        for(i=0;i<n;i++){
        printf("%d ",arr[i]);
        }
        printf("\n");
    }
    void insert(int arr[],int *n,int pos,int value){
        int i;
        for(i=*n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=value;
        (*n)++;
    }

    // delete element
    void delete(int arr[],int *n,int pos){
        int i;
        for(i=pos-1;i<*n-1;i++){
        arr[i]=arr[i+1];
        }
        (*n)--;
    }
    // search element
    void search(int arr[],int n,int key){
        int i,found=0;
        for(i=0;i<n;i++){
            if(arr[i]==key){
                printf("element found at position %d\n",i+1);
                found=1;
                break;
            }
        }
        if(found==0){
            printf("element not found");
        }
    }
    // update element
    void update(int arr[],int pos,int value){
        arr[pos-1]=value;
    }

    // reverse array
    void reverse( int arr[] ,int n){
        int i , temp;
        for(i=0;i<n/2;i++){
        temp = arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
        }
    }

    // Sorted element
    void sort(int arr[],int n){
        int i ,j ,temp;
        for(i=0;i<n-1;i++){
            for(j=1+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    // Maximum and Minimum
    void maxMin(int arr[],int n){
        int i,max,min;
        max=min=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
             if(arr[i]<min)
            min=arr[i];
        }
        printf("Maximum = %d\n",max);
        printf("Minimum = %d\n",min);
    }

int main(){
    int arr[100] ,i , n , pos , key , value ;
    int choice;
    printf("enter number of elemnt = ");
    scanf("%d",&n);
    printf("enter array elemnt = ");
    for(i=0;i<n;i++){
        scanf("%d ",&arr[i]);
    }
    do{
        printf("\n--- Array operation ---\n");
        printf("1. Display\n");
        printf("2. Insert\n");
        printf("3. Delete\n");
        printf("4. Search\n");
        printf("5. Upadate\n");
        printf("6. Reverse\n");
        printf("7. Sort\n");
        printf("8. Max and Min\n");
        printf("9. Exit\n");

        printf("enter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
            Display(arr,n);
            break;

            case 2:
            printf("insert position and value :");
            scanf("%d%d",&pos,&value);
            insert(arr, &n, pos, value);
            break;

            case 3:
            printf("enter postion to delete :");
            scanf("%d",&pos);
            delete(arr,&n,pos);
            break;

            case 4:
            printf("enter element to search: ");
            scanf("%d",&key);
            search(arr,n,key);
            break;

            case 5 :
            printf("enter position and new value :");
            scanf("%d%d",&pos,&value);
            update(arr,pos,value);
            break;

            case 6:
            reverse(arr,n);
            printf("reversed array\n");
            break;

            case 7 :
            sort(arr, n);
            printf("Array Sorted\n");
            break;

            case 8:
            maxMin(arr ,n);
            break;

            case 9:
            printf("Program ended");
            break;
            default:
            printf("Invalid choice");
        }
    }while(choice!=9);
    return 0;
}