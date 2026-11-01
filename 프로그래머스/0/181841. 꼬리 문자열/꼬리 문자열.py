def solution(str_list, ex):
    answer = ''
    for idx,val in enumerate(str_list):
        if ex not in val:
            answer+=val
    return answer