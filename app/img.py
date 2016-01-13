# coding=utf-8
import urllib
import re

def getPageTotal(page):
    for inpage in range(0,page,1):
        getImg(getHtml(inpage))

def getHtml(inpage):
    urladdress='http://tieba.baidu.com/p/4299429914?lp=5028&mo_device=1&is_jingpost=0&pn='+str(inpage)
    page = urllib.urlopen(urladdress)
    html = page.read()
    return html

def getImg(html):
    reg = r'src="(.+?\.jpg)" size="'
    imgre = re.compile(reg)
    imglist = re.findall(imgre,html)
    x = 0
    for imgurl in imglist:
        imgName='%s.jpg' % x;
        urllib.urlretrieve(imgurl,"img/"+imgName)
        print imgurl,imgName
        x+=1

print getPageTotal(10)