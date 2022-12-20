def solution(n):
    answer = 0
    strs = ''.join(sorted(str(n),reverse=True))
    answer = int(strs)
    return answer