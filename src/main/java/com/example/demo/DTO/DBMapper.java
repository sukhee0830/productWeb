package com.example.demo.DTO;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DBMapper {
	
	//---------------------INFO TABLE SQL------------------------------------------
	
	@Insert("INSERT INTO INFO VALUES(#{id}, #{name}, #{pw}, #{maddr}, #{saddr}, #{paddr}, #{s1}, #{s2})") // 회원가입 정보
	void Insert(String id, String name, String pw, String maddr, String saddr, String paddr, String s1, String s2);
	@Select("SELECT ID FROM INFO WHERE ID = #{Id}") // 아이디 찾기
	String UserId(String Id);
	@Select("SELECT PW FROM INFO WHERE ID = #{Id}") // 비번 찾기
	String UserPw(String Id);

	//---------------------ADMIN_TB TABLE SQL-------------------------------------------
	
	@Update("UPDATE ADMIN_TB SET ELECT=#{elect}, CHAIN=#{chain}, MTB=#{mtb}, NOMAL=#{nomal}, NOKICK=#{nokick}, ONKICK=#{onkick}, NOCAR=#{nocar}, ONCAR=#{oncar}")
	void Update_Ad(String elect, String chain, String mtb, String nomal, String nokick, String onkick, String nocar, String oncar);
	@Update("UPDATE ADMIN_TB SET ELECT=#{elect}")
	void updateElect(String elect);
	@Update("UPDATE ADMIN_TB SET CHAIN=#{chain}")
	void updateChain(String chain);
	@Update("UPDATE ADMIN_TB SET MTB=#{mtb}")
	void updateMtb(String mtb);
	@Update("UPDATE ADMIN_TB SET NOMAL=#{nomal}")
	void updateNomal(String nomal);
	@Update("UPDATE ADMIN_TB SET NOKICK=#{nokick}")
	void updateNokick(String nokick);
	@Update("UPDATE ADMIN_TB SET ONKICK=#{onkick}")
	void updateOnkick(String onkick);
	@Update("UPDATE ADMIN_TB SET NOCAR=#{nocar}")
	void updateNocar(String nocar);
	@Update("UPDATE ADMIN_TB SET ONCAR=#{oncar}")
	void updateOncar(String oncar);
	@Select("SELECT * FROM ADMIN_TB")
	List<AdminDB> DisplaySet();
	
	//------------------------NOTICE TABLE SQL----------------------------------------

	@Select("SELECT * FROM NOTICE")
	List<textDB> communityText();
	@Select("SELECT * FROM NOTICE WHERE SERIAL=#{userSerial}")
	List<textDB> userText(String userSerial);
	@Insert("INSERT INTO NOTICE(USERID, USERTITLE, USERSTORY, USERDATE) VALUES(#{userId}, #{userTitle}, #{userStory}, #{userDate})")
	void userNotice(String userId, String userTitle, String userStory, String userDate);
}

/*
	사용자 계정 : C##PROJECT
	비밀번호 : 1234
	
	1. 테이블
		INFO
			ID VARCHAR(50), NAME VARCHAR(20), PW VARCHAR(50), MADDR VARCHAR(100), SADDR VARCHAR(100),
			PADDR VARCHAR(20), S1 VARCHAR(10), S2 VARCHAR(10)
			
	2. 테이블
		ADMIN_TB
			ELECT INT, CHAIN INT, MTB INT, NOMAL INT, NOKICK INT, ONKICK INT, NOCAR INT, ONCAR INT -> 싹 varchar(200) 으로 변경
	
	3. 테이블
		NOTICE
			CREATE TABLE NOTICE(SERIAL NUMBER DEFAULT SERIAL.NEXTVAL, ID VARCHAR(50), TITLE VARCHAR(200), STORY VARCHAR(2000), CDATE TIMESTAMP);
			
			- SEQUENCE SE RIAL START WITH 1 INCREMENT BY 1 NOCACHE;
														  무한히 증가
	
			예시
			CREATE SEQUENCE your_sequence_name
			START WITH 1
			INCREMENT BY 1;
			INSERT INTO your_table (id, column1, column2)
			VALUES (your_sequence_name.NEXTVAL, 'value1', 'value2');
			
			SEQUENCE는 자동적으로 값을 넣어주기 때문에 INSERT INTO TABLE(FILED, FILED, TIMESTAMP) VALUES(VALUE, VALUE, SYSTIMESTAMP) 이런 식으로 삽입한다.
			TIMESTAMP의 INSERT로 시간 삽입은 SYSTIMESTAMP로 넣는다.
	

*/
