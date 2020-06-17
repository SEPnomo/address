<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jyushoroku</title>
<style>
.Sam
}
</style>
</head>
<body>
<Form id="name" method="get"action = "./AddBL">
	<table>
		<tr>
			<td><div class="Sam"></div>　　　名前:<input type="text" name="name" size="20"></td>
		</tr>
		<tr>
			<td>　　　住所:<input type="text" name="address" size="25"></td>
		</tr>
		<tr>
			<td>　　　番号:<input type="text" name="tel" size="20"></td>
		</tr>
	</table>
	<div class="Sample">
		　　　カテゴリ：<select name="categoryid">
			<option value="1">家族</option>
			<option value="2">親戚</option>
			<option value="3">知人</option>
			<option value="4">仕事</option>
			<option value="5">その他</option>
		</select>
	</div>
	<div>
		　　　<input type="submit" style="width: 7%;" value="確認">　　<input
			type="submit" style="width: 7%;" value="戻る">
	</div>
	</Form>
</body>
</html>