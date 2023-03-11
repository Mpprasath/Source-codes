
struct TreeNode* createBST(int*nums,int first,int last)
{
    if(last<first) return NULL;
    int mid=(first+last)/2;
    struct TreeNode* root=(struct TreeNode*)malloc(sizeof(struct TreeNode));
    root->val=nums[mid];
    root->left=createBST(nums,first,mid-1);
    root->right=createBST(nums,mid+1,last);
    return root;
}

struct TreeNode* sortedArrayToBST(int* nums, int numsSize){
    if(numsSize<=0) return NULL;
    else return createBST(nums,0,numsSize-1);
      

}

