class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        \\\
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        \\\
        lis =nums1+ nums2
        lis.sort()
        if len(lis) % 2 != 0:
            return lis[int((len(lis)-1)/2)]
        else:
            return (lis[int(len(lis)/2)] + lis[int((len(lis)-1)/2)]) / 2.0
        