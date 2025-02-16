class _21 {
    public ListNode mergeTwoLists(ListNode list0, ListNode list1) {
        if (list0 == null) {
            return list1;
        }
        if (list1 == null) {
            return list0;
        }

        if (list0.val <= list1.val) {
            list0.next = mergeTwoLists(list0.next, list1);
            return list0;
        }

        list1.next = mergeTwoLists(list0, list1.next);
        return list1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
