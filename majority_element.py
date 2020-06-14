# Uses python3
import sys

def majority_element(a):
    a = sorted(a)
    b = len(a)
    test_count = 1
    if b == 1:
        return 1
    test_element = a[0]
    for i in range(0, len(a)-1):
        if a[i+1] == test_element:
            print(test_element, test_count)
            test_count += 1
            if test_count > b/2:
                return 1
        else:
            test_element = a[i+1]
            test_count = 1
    return 0


if __name__ == '__main__':
    input = sys.stdin.read()
    n, *a = list(map(int, input.split()))
    print(majority_element(a))
