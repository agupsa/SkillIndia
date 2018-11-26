<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration form for Apprenticeship Training</title>
</head>
<body>

		<h2>Enter Details for Registration</h2>

			<form action="registerCandidate" method="post">
				<table class="form">
					<tr>

						<td colspan="6">
							<h3>Personal Details</h3>
						</td>
					</tr>



					<tr>
						<td></td>

						<th>Name <span class="req_span">*</span></th>
						<td><input name="Name" type="text"
							placeholder="Enter Your Name" maxlength="50" id="Name"
							title="Name" class="required" /></td>
						<th>Gender <span class="req_span">*</span>
						</th>
						<td><select name="Gender" id="cphBody_ddlGender"
							title="Gender" class="required">
								<option value="">-Select-</option>
								<option value="M">Male</option>
								<option value="F">Female</option>
								<option value="T">Others</option>

						</select></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<th>Father Name<span class="req_span">*</span></th>
						<td><input name="FatherName" type="text"
							placeholder="Father's Name" maxlength="50" id="FatherName"
							title="Father Name" class="required" /></td>
					</tr>

					<tr>
						<td style="width: 5%"></td>
						<th style="width: 25%">Date of Birth<span class="">*</span></th>
						<td style="width: 20%"><input name="Date of Birth"
							type="date" title="Date of Birth" style="width: 100px;">
							<span style="color: Red; visibility: hidden;">Invalid Date</span></td>
					<tr>
						<td></td>
						<td></td>
						<td><span class="format">dd-mm-yyyy</span> <br /> <span
							class="format">Minimum age should be 14 years.</span></td>
					</tr>
					<tr>
						<th style="width: 20%"></th>
						<td style="width: 25%">
							<div id="cphBody_ctl03"></div>
						</td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<th>Aadhaar Card No. (UID No.)</th>
						<td><input name="UID" type="text"
							placeholder="Aadhar card No." maxlength="12" id="UID"
							title="Aadhaar Card No. (UID No.)" style="width: 100px;" /></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<th>Category<span class="req_span">*</span></th>
						<td><select name="Category" id="Category" title="Category"
							class="required">
								<option value="-1" title="-Select-">-Select-</option>
								<option value="2" title="Other Backward Class">Other
									Backward Class</option>
								<option value="1" title="General">General</option>
								<option value="3" title="Schedule Castes">Schedule
									Castes</option>
								<option value="4" title="Schedule Tribes">Schedule
									Tribes</option>

						</select></td>
				</table>



			<table class="form">
				<tr>
					<td colspan="6">
						<h3>Contact Details</h3>
					</td>
				</tr>
				<tr>
					<td style="width: 5%"></td>
					<th style="width: 25%">Address <span class="req_span">*</span></th>
					<td colspan="4"><input name="Address" type="text"
						maxlength="200" id="Address" title="Address" class="required"
						style="width: 600px;" /></td>
				</tr>

				<tr>
					<th style="width: 25%">State <span class="req_span">*</span></th>
					<td style="width: 20%"><select name="State" id="State"
						title="State" class="required">
							<option selected="selected" value="-1" title="-Select-">-Select-</option>
							<option value="35" title="Andaman &amp; Nicobar Islands">Andaman
								&amp; Nicobar Islands</option>
							<option value="28" title="Andhra Pradesh">Andhra Pradesh</option>
							<option value="12" title="Arunachal Pradesh">Arunachal
								Pradesh</option>
							<option value="18" title="Assam">Assam</option>
							<option value="10" title="Bihar">Bihar</option>
							<option value="4" title="Chandigarh">Chandigarh</option>
							<option value="22" title="Chhattisgarh">Chhattisgarh</option>
							<option value="26" title="Dadra &amp; Nagar Haveli">Dadra
								&amp; Nagar Haveli</option>
							<option value="25" title="Daman &amp; Diu">Daman &amp;
								Diu</option>
							<option value="7" title="Delhi">Delhi</option>
							<option value="30" title="Goa">Goa</option>
							<option value="24" title="Gujarat">Gujarat</option>
							<option value="6" title="Haryana">Haryana</option>
							<option value="2" title="Himachal Pradesh">Himachal
								Pradesh</option>
							<option value="1" title="Jammu and Kashmir">Jammu and
								Kashmir</option>
							<option value="20" title="Jharkhand">Jharkhand</option>
							<option value="29" title="Karnataka">Karnataka</option>
							<option value="32" title="Kerala">Kerala</option>
							<option value="31" title="Lakshadweep">Lakshadweep</option>
							<option value="23" title="Madhya Pradesh">Madhya Pradesh</option>
							<option value="27" title="Maharashtra">Maharashtra</option>
							<option value="14" title="Manipur">Manipur</option>
							<option value="17" title="Meghalaya">Meghalaya</option>
							<option value="15" title="Mizoram">Mizoram</option>
							<option value="13" title="Nagaland">Nagaland</option>
							<option value="21" title="Odisha">Odisha</option>
							<option value="34" title="Puducherry">Puducherry</option>
							<option value="3" title="Punjab">Punjab</option>
							<option value="8" title="Rajasthan">Rajasthan</option>
							<option value="11" title="Sikkim">Sikkim</option>
							<option value="33" title="Tamil Nadu">Tamil Nadu</option>
							<option value="36" title="Telangana">Telangana</option>
							<option value="16" title="Tripura">Tripura</option>
							<option value="9" title="Uttar Pradesh">Uttar Pradesh</option>
							<option value="5" title="Uttarakhand">Uttarakhand</option>
							<option value="19" title="West Bengal">West Bengal</option>

					</select></td>
				<tr>
					<td></td>
					<th>Pincode<span class="req_span">*</span></th>
					<td colspan="3"><input name="Pincode" type="text"
						maxlength="6" id="Pincode" title="Pincode" class="required" /></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<th>Contact No. <span class="req_span">*</span></th>
					<td><input name="ContactNo" type="text" maxlength="15"
						id="ContactNo" title="Contact No." class="required" /></td>
					<th>Email ID <span class="req_span">*</span></th>
					<td><input name="Email" type="text"
						placeholder="abc@gmail.com" maxlength="100" id="Email"
						title="Email ID" class="required" /> <br /></td>
					<td></td>
				</tr>
			</table>

			<table class="form" style="width: 100%">
				<tr>
					<td colspan="6">
						<h3>
							Technical Qualification <span class="sub_text">(Please
								fill if applicable)</span>
						</h3>
					</td>
				</tr>
				<tr>
					<th style="width: 20%">Name of University<span
						class="req_span">*</span></th>
					<td style="width: 25%"><input name="Council" type="text"
						maxlength="200" id="Council" title="University Name" class="req" />
					</td>
					<td style="width: 5%"></td>

				</tr>
				<tr>
					<th>Name of Trade/Course<span class="req_span">*</span></th>
					<td><input name="Trade" type="text" maxlength="200" id="Trade"
						title="Trade Name" class="req" /></td>
				</tr>
				<tr>
					<th>Maximum Marks <span class="req_span">*</span></th>

					<td><input name="MaxMarks" type="text" maxlength="7"
						onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphBody$txtTechMaxMarks\&#39;,\&#39;\&#39;)&#39;, 0)"
						onkeypress="if (WebForm_TextBoxKeyHandler(event) == false) return false;"
						id="cphBody_txtTechMaxMarks" title="Maximum Marks" class="req" />

					</td>
				</tr>
				<tr>

					<th>Obtained Marks<span class="req_span">*</span></th>
					<td><input name="ObtainedMarks" type="text" maxlength="7"
						title="Obtained Marks" class="req" /></td>
				</tr>
				<tr>
					<th>Overall Percentage <span class="req_span">*</span></th>
					<td><input name="Percentage" type="text" maxlength="4"
						id="Percentage" title="Overall Percentage" /></td>
				</tr>
			<tr>
				<td colspan="6">
					<h3>Upload Documents</h3>
				</td>
			</tr>
			<tr style="height: 50px;">
				<td style="width: 5%"></td>
				<th style="width: 25%">Upload Your Passport size Photograph <span
					class="req_span">*</span>
				</th>
				<td style="width: 20%"><input type="file"
					name="ctl00$cphBody$fuPhoto" id="cphBody_fuPhoto"
					title="Photograph" class="required preview_file" /><br /> <span
					class="format">Upload JPG/JPEG/GIF/PNG up to 200 KB with
						minimum size of 10 KB and dimensions that are atleast 3.5cm x
						4.5cm(132 x 170 pixels) </span></td>
				<td style="width: 20%"><img id="imgSelected" src="#"
					alt="Selected Photo" class="preview border"
					style="display: none; width: inherit" /></td>
				<td style="width: 25%"></td>
				<td style="width: 5%"></td>
			</tr>
			<tr>
				<td></td>
				<th>Qualification Document</th>
				<td><input type="file" name="Document" id="Document"
					title="DOB Document" class="required preview_file" /><br /> <span
					class="format">Upload Doc/Docx/PDF/JPG up to 200 KB with
						minimum size of 10 KB and dimensions that are atleast 15cm x
						15cm(566 x 566 pixels) </span></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>

			<tr>
				<th colspan="1">Declaration</th>
				<td></td>
				<th colspan="5"><span title="Declaration"><input
						id="Declaration" type="checkbox" name="Declaration" /><label
						for="Declaration">I hereby declare that the information
							submitted by me is correct and true to the best of my knowledge.
							I shall be liable for any disciplinary/punitive action in case
							any of the details are found to be incorrect.</label></span></th>
			</tr>
			<tr>
				<td colspan="6" style="text-align: center"><input type="submit"
					name="Submit" value="Submit" id="Submit" title="Submit" /> <input
					type="submit" name="Clear" value="Clear" id="Clear" title="Clear" /></td>

			</tr>
		</table>
		</form>
</body>
</html>