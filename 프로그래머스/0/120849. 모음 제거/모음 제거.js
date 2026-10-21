function solution(my_string) {
    my_string=my_string.replaceAll("a","");
    my_string=my_string.replaceAll("i","");
    my_string=my_string.replaceAll("u","");
    my_string=my_string.replaceAll("e","");
    my_string=my_string.replaceAll("o","");
    return my_string;
}