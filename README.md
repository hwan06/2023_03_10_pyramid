# 피라미드 별 찍기
### i = 현재층, n = 전체층
### 사용자가 입력한 값인 n이 3이라는 가정하에 큰 for문은 3번 반복을 한다 2번째 for문에선 처음엔 공백을 두번 출력하고 
### 밑 for문으로 내려가 별을 1개 찍어준뒤 줄을 바꾸고 다시 큰 for문으로 올라가 i가 1이 된다 그렇다면
### 공백은 하나가 줄어 한개만 출력될것이고 별은 2개가 증가해 3개가 찍힐것이다. 그 후 다시 위 for문으로 올라가
### i는 2가 될것이고 공백은 찍히지 않으며 별은 7개가 출력될것이다. 별의 개수 공식은 i*2+1로써 100층이 입력이 된다면
### i는 최대 99까지 증가하기 때문에 99*2+1을하여 총 199개의 별이 출력된다. 공백 공식은 전체층(n)에서 현재층(i)를 빼주면
### n = 100, i = 1이라는 가정하에 n - i = 99개의공백이 출력 된다.

![image](https://user-images.githubusercontent.com/114748934/224193591-3ff07a16-decc-4147-844e-3c721003fa49.png)
### 실행 화면
![image](https://user-images.githubusercontent.com/114748934/224193674-0c6a8c8e-9886-47fb-9210-5ed61b8a918e.png)
