def solution(seoul):
    answer = ''
    for i in range(len(seoul)):
        if seoul[i] == 'Kim':
            answer = '김서방은 {}에 있다'.format(i)
    return answer

## 다른사람 풀이
'''
def findKim(seoul):
    return "김서방은 {}에 있다".format(seoul.index('Kim'))
'''