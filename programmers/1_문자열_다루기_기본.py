# len() 함수 괄호 주의
def solution(s):
    if ((len(s) == 4) | (len(s) == 6)) & s.isdecimal():
        return True
    else:
        return False