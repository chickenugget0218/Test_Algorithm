def solution(my_string):
    answer = ''
    _lst=['a','e','i','o','u']
    answer = ''.join(i for i in my_string if i not in _lst)
    return answer