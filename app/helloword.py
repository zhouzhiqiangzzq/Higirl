# -*- coding: utf-8 -*-
#mysqldb
import MySQLdb

#连接
conn=MySQLdb.connect(host="127.0.0.1",user="root",passwd="123456",db="test",charset="utf8")
cursor = conn.cursor()
#查询
n = cursor.execute("select * from userinfo")
for row in cursor.fetchall():
    print row
    for r in row:
        print r

cursor.close()

#提交
conn.commit()
#关闭
conn.close()



conn=MySQLdb.connect("127.0.0.1","root","123456")
cursor=conn.cursor()
cursor.execute("create database if not exists python")
conn.select_db('python')
cursor.execute("create table test(test varchar(100) NOT NULL )")
cursor.close()
#提交
conn.commit()
#关闭
conn.close()

