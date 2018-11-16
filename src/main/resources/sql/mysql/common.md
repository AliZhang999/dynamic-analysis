subjectList
===
select subjectCode `key`,subjectName `name` from subject_type

师资队伍获取专业技术职称指标
===
select 专业技术职称 `key`,专业技术职称 `name` from 教职工基本信息 group by 专业技术职称

师资队伍获取高层次人才指标
===
select 类型 `key`,类型 `name` from 高层次人才 group by 类型

师资队伍获取教师情况指标
===
select 性别 `key`,性别 `name` from 教职工基本信息 group by 性别

师资队伍获取学历情况指标
===
select 学历 `key`,学历 `name` from 教职工基本信息 group by 学历

师资队伍获取最高学位指标
===
select 最高学位 `key`,最高学位 `name` from 教职工基本信息 group by 最高学位

师资队伍获取高层次研究团队指标
===
select 类型 `key`,类型 `name` from 高层次教学研究团队 group by 类型

师资队伍专业技术职称指标趋势统计
===
select count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
    select distinct a.任教专业代码,b.工号,b.专业技术职称 from 在编教职工 a 
    join 教职工基本信息 b on a.工号=b.工号 where b.专业技术职称 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

师资队伍专业技术职称指标对比统计
===
select y.专业技术职称,count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,b.专业技术职称 from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号 where b.专业技术职称 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.专业技术职称

师资队伍教师情况指标趋势统计
===
select count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
    select distinct a.任教专业代码,b.工号,b.性别 from 在编教职工 a 
    join 教职工基本信息 b on a.工号=b.工号 where b.性别 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

师资队伍教师情况指标对比统计
===
select y.性别,count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,b.性别 from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号 where b.性别 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.性别

师资队伍学历情况指标趋势统计
===
select count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
    select distinct a.任教专业代码,b.工号,b.学历 from 在编教职工 a 
    join 教职工基本信息 b on a.工号=b.工号 where b.学历 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

师资队伍学历情况指标对比统计
===
select y.学历,count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,b.学历 from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号 where b.学历 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.学历

师资队伍最高学位指标趋势统计
===
select count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
    select distinct a.任教专业代码,b.工号,b.最高学位 from 在编教职工 a 
    join 教职工基本信息 b on a.工号=b.工号 where b.最高学位 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

师资队伍最高学位指标对比统计
===
select y.最高学位,count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,b.最高学位 from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号 where b.最高学位 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.最高学位

师资队伍高层次人才指标趋势统计
===
select count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
    select distinct a.任教专业代码,b.工号,c.类型
    from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号
    join 高层次人才 c on a.工号=c.工号
    where c.类型 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

师资队伍高层次人才指标对比统计
===
select y.类型,count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,c.类型
    from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号
    join 高层次人才 c on a.工号=c.工号
    where c.类型 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.类型

师资队伍高层次研究团队指标趋势统计
===
select count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
    select distinct a.任教专业代码,b.工号,c.类型
    from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号
    join 高层次教学研究团队 c on a.工号=c.负责人工号
    where c.类型 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

师资队伍高层次研究团队指标对比统计
===
select y.类型,count(y.工号) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,c.类型
    from 在编教职工 a
    join 教职工基本信息 b on a.工号=b.工号
    join 高层次教学研究团队 c on a.工号=c.负责人工号
    where c.类型 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.类型

科研项目项目经费指标
===
select a.类型 `key`, a.类型 `name` from (
  select 工号,项目经费国内 经费,'国内经费' as 类型
  from 教师主持科研项目情况
  union all
  select 工号,项目经费国际 经费,'国际经费' as 类型
  from 教师主持科研项目情况
) a group by a.类型

科研项目项目经费指标趋势统计
===
select convert(sum(y.经费),decimal(10,2)) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,c.经费,c.类型
  from 在编教职工 a
  join 教职工基本信息 b on a.工号=b.工号
  join (
    select 工号,项目经费国内 经费,'国内经费' as 类型
    from 教师主持科研项目情况
    union all
    select 工号,项目经费国际 经费,'国际经费' as 类型
    from 教师主持科研项目情况
  ) c on a.工号=c.工号
  where c.类型 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode#

科研项目项目经费指标对比统计
===
select y.类型,convert(sum(y.经费),decimal(10,2)) 总数
from (
	select distinct 专业代码 from 专业基本情况 where 代码版本='2012'
) x left join (
	select distinct a.任教专业代码,b.工号,c.经费,c.类型
  from 在编教职工 a
  join 教职工基本信息 b on a.工号=b.工号
  join (
    select 工号,项目经费国内 经费,'国内经费' as 类型
    from 教师主持科研项目情况
    union all
    select 工号,项目经费国际 经费,'国际经费' as 类型
    from 教师主持科研项目情况
  ) c on a.工号=c.工号
  where c.类型 in (#join(indications)#)
) y on x.专业代码=y.任教专业代码 where left(x.专业代码,4)=#subjectcode# group by y.类型
