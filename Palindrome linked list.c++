class Solution {
public:
    bool isPalindrome(ListNode* head) {
        stack<int>s;
        ListNode* head1=head;
        while(head1!=nullptr){
            s.push(head1->val);
            head1=head1->next;
        }
        while(head!=nullptr){
            if(head->val!=s.top()) return false;
            head=head->next;
            s.pop();
        }
        return true;
    }
};
