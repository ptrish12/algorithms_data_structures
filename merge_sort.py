


def merge_lists(first_half, second_half):
    ordered_list = []
    print('merging', first_half, second_half)
    while len(first_half + second_half) > 0:
        if len(first_half) == 0:
            ordered_list.append(second_half[0])
            del second_half[0]
        elif len(second_half) == 0:
            ordered_list.append(first_half[0])
            del first_half[0]
        elif first_half[0] <= second_half[0]:
            ordered_list.append(first_half[0])
            del first_half[0]
        else:
            ordered_list.append(second_half[0])
            del second_half[0]
    print('sorted portion:', ordered_list)
    return ordered_list


def merge_sort(nums: list):
    # ordered_list = []
    print('sorting', nums)
    if len(nums) == 1:
        return nums

    midpoint = len(nums) // 2
    first_half = merge_sort(nums[:midpoint]) # recursively divide array
    second_half = merge_sort(nums[midpoint:])

    merged_and_sorted = merge_lists(first_half, second_half)

    return merged_and_sorted


my_list = [25, 5, 2, 11, 1, 2, 9, 15]

print(merge_sort(my_list))

