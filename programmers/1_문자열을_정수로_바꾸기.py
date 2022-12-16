def solution(s):
    answer = 0
    nums=[]
    if '-' in s:
        nums = s.split('-')
        answer = -(int(nums[1]))
    elif '+' in s:
        nums = s.split('+')
        answer = +(int(nums[1]))
    else:
        answer = int(s)

    return answer

    