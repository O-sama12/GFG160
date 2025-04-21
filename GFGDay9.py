class Solution:
    @staticmethod
    def getMinDiff(self, arr, k):
        arr.sort()
        n = len(arr)
        res = arr[-1] - arr[0]
        for i in range(n - 1):
            low = min(arr[0] + k, arr[i + 1] - k)
            high = max(arr[-1] - k, arr[i] + k)
            if low < 0: continue
            res = min(res, high - low)
        return res
if __name__ == "__main__":
    test_case = int(input())
    while test_case > 0:
        k = int(input())
        arr = list(map(int, input().strip().split()))
        print(getMinDiff(k, arr))
        test_case -= 1
        
