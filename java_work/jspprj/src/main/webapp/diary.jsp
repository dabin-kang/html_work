<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2026년1월 달력</title>
</head>
<body>
	<%!
	
	%>
	
	<% for(int i = 1; i <= 31; i++){
		
	}
		%>
	
	
	<style>
		table{
		width:600px
		height: 600px
		border: 1px solid #333;
		border-collapse: collapse;
		}
		td {
        border: 1px solid #ccc;
        text-align: center;
    }
	</style>
	
	
	<table>
		<div>1월 달력</div>
		<div>
		<td>월</td>
		<td>화</td>
		<td>수</td>
		<td>목</td>
		<td>금</td>
		<td>토</td>
		<td>일</tr></td>
		</div>
		
		<div>
		<td>1</td>
		<td>2</td>
		<td>3</td>
		<td>4</td>
		<td>5</td>
		<td>6</td>
		<td>7</tr></td>
		</div>
		
		<div>
		<td>8</td>
		<td>9</td>
		<td>10</td>
		<td>11</td>
		<td>12</td>
		<td>13</td>
		<td>14</tr></td>
		</div>
		
		<div>
		<td>15</td>
		<td>16</td>
		<td>17</td>
		<td>18</td>
		<td>19</td>
		<td>20</td>
		<td>21</tr></td>
		</div>
		
		<div>
		<td>22</td>
		<td>23</td>
		<td>24</td>
		<td>25</td>
		<td>26</td>
		<td>27</td>
		<td>28</tr></td>
		</div>
		
		<div>
		<td>29</td>
		<td>30</td>
		<td>31</td>
		</div>
	
	
	</table>
</body>
</html>