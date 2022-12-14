### AI 플랫폼

## Naver AI Platform (네이버 인공지능 플랫폼)

- Naver CLOVA
- 네이버에서 개발한 인공지능 기술로 AI Service를 제공
- API 형태로 이용 가능 (코드 제공)
- 요청 방식 / 응답 방식(결과) 지정
- 지정된 규칙대로 요청하고 응답 받아서 사용 (AI 서비스 제공)
- 네이버 클라우드 플랫폼에서 이용할 수 있는 서비스

## Naver AI API 서비스

- CLOVA Face Recognition (CFR)
- CLOVA OCR (Optical Character Recognition)
- CLOVA Speech Recognition (CSR)
- CLOVA Voice - Premium
- CLOVA Chatbot
- Pose estimation
- Object Detection

## CLOVA Face Recognition (CFR)

- 이미지 속의 얼굴을 감지하고 인식하여 얻은 다양한 정보를 제공하는 API 서비스
- 입력된 비전 데이터(사진 파일)를 통해 얼굴을 인식하거나 얼굴을 감지
- 유명인 얼굴 인식 API 서비스
- 닮은 유명인 이름, 닮은 정보 (정확도)
- 얼굴 감지 API 서비스
- 감지된 얼굴을 분석한 정보
- 성별, 추정 나이, 감정, 얼굴 방향 등

## CLOVA OCR (Optical Character Recognition)

- 광학 문자 인식 API 서비스
- 사진 속에서 텍스트 정보를 찾고 의미를 판별하는 기술
- 언어와 이미지 데이터를 입력 받아서, 그에 맞는 인식 결과를 텍스트로 반환

## CLOVA Speech Recognition (CSR)

- 음성 인식 API 서비스
- 사람의 목소리를 텍스트로 변환
- 음성을 텍스트로 변환 : STT(Speech-To-Text)
- 음성 파일을 입력 받아서 변환된 텍스트로 반환
- 언어 선택 가능

## CLOVA Voice - Premium

- 챗봇 제작 API 서비스
- 사용자의 질문 의도를 이해하여 고객 대응 등 다양한 서비스에 활용할 수 있는 Chatbot 제작 지원

## Pose estimation

- 이미지 내 사람, 동물, 사물 등 객체의 타입과 위치를 감지하여 정보를 제공하는 API 서비스
- 탐지된 객체명, 객체의 수, 바운딩 박스용 좌표, 객체별 확률값

## AI API 사용 방법

- AI 플랫폼 활용한 지능형 웹 서비스 제공
- 뷰 페이지 (서비스 요청) -> 컨트롤러 -> 서비스(API 요청) -> 결과반환 -> 컨트롤러 -> 뷰 페이지로 결과 출력
- API 요청 : 네이버 서버에 요청
- 서비스 클래스에서 메소드로 구현 (그대로 복사해서 요청에 필요한 항목들만 변경해서 서비스 요청)
- 반환값 메소드이름() {
- 여기에 API 코드 복사;
- 변경;
- }
- 서버로부터 반환된 결과값을 추출해서
- 컨트롤러에게 반환

## 요청 / 응답 결과

- CLOVA Face Recognition (CFR)
- 이미지(얼굴 사진) 파일 전송
- JSON 형태로 반환 : JSON 데이터 추출해서 출력
- 자바 코드로 JSON 추출
- CLOVA OCR (Optical Character Recognition)
- 텍스트가 포함된 이미지 파일 전송
- JSON 형태로 반환 : JSON 데이터 추출해서 출력
- CLOVA Speech Recognition (CSR)
- 음성 파일 전송
- JSON 형태로 반환 : JSON 데이터 추출해서 출력
- CLOVA Voice - Premium
- 문자열 또는 텍스트 파일 전송
- 스트림으로 반환 받아서 파일로 저장하고 웹 브라우저에서 음성 파일 PLAY

## CLOVA Chatbot

- 텍스트 또는 음성 파일 전송
- SON 형태로 반환 : JSON 데이터 추출해서 출력
- Pose estimation
- 포즈를 취하고 있는 사람이 포함된 이미지 파일 전송
- SON 형태로 반환 : JSON 데이터 추출해서 이미상 신체 각 부위에 인식 결과 출력

## Object Detection

- 사람, 동물, 사물 등 객체가 포함된 이미지 파일 전송
- SON 형태로 반환 : JSON 데이터 추출해서 출력