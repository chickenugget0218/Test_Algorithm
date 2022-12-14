def solution(rsp):
    answer = ''

    for i in range(len(rsp)):
        if '0' in rsp[i]:
            answer += ''.join('5')
        elif '2' in rsp[i]:
            answer += ''.join('0')
        elif '5' in rsp[i]:
            answer += ''.join('2')
    return answer