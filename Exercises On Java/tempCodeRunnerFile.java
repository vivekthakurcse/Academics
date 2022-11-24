 Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        int i =1;
        while(i<=n){
            int odd =(2*i-1);
            if(odd>n){
                break;
            }
            System.out.print(odd +" ");
            i++;
        }