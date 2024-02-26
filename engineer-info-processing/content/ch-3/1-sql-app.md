# SQL 응용

## 절차형 SQL 작성

### SQL 문법 분류
> 보무병회

|     분류      |                                             설명                                              |
|:-------------:|:---------------------------------------------------------------------------------------------:|
| 데이터 정의어<br>(DDL) |          테이블이나 관계의 구조를 생성하는데 사용<br>다양한 응용 프로그램과 DB가 서로 인터페이스 할 수 있는 방법을 제공하는 기능<br>스키마, 도메인, 테이블, 뷰, 인덱스를 정의하거나 변경 또는 삭제할 때 쓰는 언어<br>*CREATE, ALTER, DROP, TRUNCATE, RENAME*          |
| 데이터 조작어<br>(DML) |   DB에 저장된 자료 **입력,수정,삭제,조회**하는 언어<br>사용자와 DB 사이 인터페이스를 위한 수단을 제공하는 기능<br>*SELECT(질의어), INSERT, UPDATE, DELETE*   |
| 데이터 제어어<br>(DCL) | DB 관리자가 **데이터 보안**, **무결성 유지**, **병행 제어**, 회복 위한 DBA 제어용 언어<br>*GRANT, REVOKE, COMMIT, ROLLBACK, SAVEPOINT(=CHECKPOINT)* |
### DML, DCL 문법
| 갱신 | UPDATE ~ SET |
| ---- | ---- |
| 삭제 | DELETE ~ FROM ~ **WHERE** |
| 삽입 | INSERT ~ INTO ~ **VALUES** |
| 권한 | **GRANT** {권한} **TO** {사용자}<br>ex. GRANT CREATE TABLE TO PARK; |

### DELETE 명령
테이블 내의 인스턴스 값을 삭제하는 데이터 조작어(DML)이고, 
테이블 삭제(DROP)는 테이블의 스키마(테이블 정의)를 삭제하는 데이터 정의어(DDL)이므로 다름


### BETWEEN 연산
점수 BETWEEN 90 AND 95 는 **점수 >= 90 AND 점수 <= 95** 를 의미

| 연산 | 설명 |
| ---- | ---- |
| COMMIT; | DB 트랜잭션 내용 업데이트를 영구적으로 확정 |
| ROLLBACK; | DB 업데이트 오류 발생 시 이전 상태로 되돌림 |
| SAVEPOINT 이름; | 특정 지점을 지정 |
| ROLLBACK TO<br>SAVEPOINT 이름; | SAVEPOINT 지정한 부분 이후에 발생한 <br>트랜잭션 취소 |

| 문법 | 설명 |
| ---- | ---- |
| GRANT 권한 ON 테이블 <br>TO 사용자 [WITH 권한 옵션] |  관리자가 사용자에게 테이블에 대한 권한을 부여하는 명령어 |
| REVOKE 권한 ON 테이블<br>FROM 사용자 [CASCADE] | 관리자가 사용자에게 부여했던 테이블 대한 권한 회수하는 명령어 |

### OLAP 연산
| 연산 | 설명 |
| ---- | ---- |
| Roll-Up |  |
| Drill-Down |  |
| Slicing |  |
| Dicing |  |
| Pivoting |  |

### ASC, DESC
ex. 판매량이 많은 순으로 출력하려면? DESC

## 응용 SQL 작성

### DBMS 필수 기능
| 분류 | 설명 |
| :--: | :--: |
| 데이터 정의<br>기능 | 다양한 응용 프로그램과 DB가 서로 인터페이스 할 수 있는 방법을 제공하는 기능<br>구현된 하나의 물리적 구조의 DB로 가장 적절한 DB 구조를 정의할 수 있는 기능 |
| 데이터 조작<br>기능 | **사용자와 DB 사이 인터페이스를 위한 수단을 제공하는 기능**<br>DB 이용 사용자의 요구 따라 체계적 DB 접근, 조작할 수 있는 기능 |
| 데이터 제어<br>기능 | 공용 목적으로 관리되는 DB 내용에 대해 항상 <br>정확성과 안전성을 유지할 수 있도록 데이터를 제어 가능 |