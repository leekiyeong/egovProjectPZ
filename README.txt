1. oracle pz 유저 생성
sqlplus -> 아이디 : sys/1234 as sysdba
          -> 비번 : enter
CREATE USER c##pz IDENTIFIED BY 1234;
GRANT connect, resource, dba TO c##pz;

2. MyBatis 테스트 쿼리문
CREATE TABLE TEST(NAME VARCHAR2(10));
INSERT INTO TEST(NAME) VALUES('TEST1');
COMMIT;

3. naver map geocode 명령어
curl -G "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode" --data-urlencode "query=경기 구리시 건원대로34번길 15 구리인창파킹프라자"

svn을 기반으로 팀 프로젝트를 협업하였으며, 추후 한번에 Commit하였음
