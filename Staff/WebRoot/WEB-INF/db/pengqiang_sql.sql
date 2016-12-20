select ename,job,dname,loc,sal from 
(select row_number() over(order by SAL desc) rn,e.*,d.* from EMP e,DEPT d where  e.deptno =d.deptno)
where rn > 5 and rn <= 10;
