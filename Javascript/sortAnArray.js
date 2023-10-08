let arr = [4, 12,19,1, 22,11,12,12,12, 3];

function merge(arr,start,mid,end){

    let new_arr = new Array(end-start+1);
   
    let i = start;
    let j = mid+1;
    let k = 0;
    
    while (i<mid+1 & j<end+1){
        if (arr[i]>=arr[j]){
            new_arr[k] = arr[i];
            i += 1;
        }
        else{
            new_arr[k] = arr[j];
            j += 1;
        }
        k += 1;
    }

    while (i<mid+1){
        new_arr[k] = arr[i];
        i += 1
        k += 1
    }

    while(j<end+1){
        new_arr[k] = arr[j];
        j += 1;
        k += 1;
    }
    
    let idx = 0;
    for (let i=start;i<end+1;i++){
        arr[i] = new_arr[idx];
        idx += 1;
    }
    

}

function sortAnArray(arr,start,end){
    
    if (end>start){
        let mid = Math.floor((end+start)/2);
        sortAnArray(arr,start,mid);
        sortAnArray(arr,mid+1,end);

        merge(arr,start,mid,end);
    }
}

sortAnArray(arr,0,arr.length-1)
console.log(arr)