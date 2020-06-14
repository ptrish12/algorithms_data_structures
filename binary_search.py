# Uses python3
import sys

def binary_search(a, x):
    left, right = 0, len(a)
    while left <= right:
        midpoint = int(left + (right - left) / 2)
        if left > (len(a) - 1):
            return -1
        elif x == a[midpoint]:
            return midpoint
        elif x < a[midpoint]:
            right = midpoint - 1
        else:
            left = midpoint + 1
    return -1


if __name__ == '__main__':
    input = sys.stdin.read()
    data = list(map(int, input.split()))
    n = data[0]
    m = data[n + 1]
    a = data[1 : n + 1]
    for x in data[n + 2:]:
        print(binary_search(a, x), end=' ')
