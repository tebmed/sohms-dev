<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="XML2PN"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="Layout"/>
		<constant value="MM"/>
		<constant value="J.allInstances():J"/>
		<constant value="J.asSequence():J"/>
		<constant value="J.first():J"/>
		<constant value="J.generatePN():J"/>
		<constant value="/XML2TINAPN/ws.net"/>
		<constant value="J.writeTo(J):J"/>
		<constant value="1:16-1:25"/>
		<constant value="1:16-1:41"/>
		<constant value="1:16-1:55"/>
		<constant value="1:16-2:32"/>
		<constant value="1:16-2:45"/>
		<constant value="2:54-2:74"/>
		<constant value="1:16-2:75"/>
		<constant value="self"/>
		<constant value="generatePN"/>
		<constant value="MMM!Layout;"/>
		<constant value="net generatedPetriNet&#10;"/>
		<constant value=""/>
		<constant value="1"/>
		<constant value="0"/>
		<constant value="node"/>
		<constant value="2"/>
		<constant value="J.generatePlace():J"/>
		<constant value="J.+(J):J"/>
		<constant value="&#10;"/>
		<constant value="5:3-5:28"/>
		<constant value="6:48-6:50"/>
		<constant value="6:3-6:7"/>
		<constant value="6:3-6:12"/>
		<constant value="6:52-6:58"/>
		<constant value="6:61-6:68"/>
		<constant value="6:61-6:84"/>
		<constant value="6:52-6:84"/>
		<constant value="6:85-6:89"/>
		<constant value="6:52-6:89"/>
		<constant value="6:3-6:90"/>
		<constant value="5:3-6:90"/>
		<constant value="station"/>
		<constant value="places"/>
		<constant value="generatePlace"/>
		<constant value="MMM!Station;"/>
		<constant value="ressource"/>
		<constant value="J.size():J"/>
		<constant value="pl "/>
		<constant value="name"/>
		<constant value="J.&lt;&gt;(J):J"/>
		<constant value="14"/>
		<constant value="20"/>
		<constant value="("/>
		<constant value="J.toString():J"/>
		<constant value=")&#10;"/>
		<constant value="9:28-9:32"/>
		<constant value="9:28-9:42"/>
		<constant value="9:28-9:49"/>
		<constant value="10:14-10:19"/>
		<constant value="10:20-10:24"/>
		<constant value="10:20-10:29"/>
		<constant value="10:14-10:29"/>
		<constant value="11:12-11:20"/>
		<constant value="11:22-11:23"/>
		<constant value="11:12-11:23"/>
		<constant value="13:23-13:27"/>
		<constant value="12:20-12:23"/>
		<constant value="12:24-12:32"/>
		<constant value="12:24-12:43"/>
		<constant value="12:20-12:43"/>
		<constant value="12:44-12:49"/>
		<constant value="12:20-12:49"/>
		<constant value="11:9-13:33"/>
		<constant value="10:14-13:33"/>
		<constant value="9:3-13:33"/>
		<constant value="nbrJeton"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
			<push arg="3"/>
			<push arg="4"/>
			<findme/>
			<call arg="5"/>
			<call arg="6"/>
			<call arg="7"/>
			<call arg="8"/>
			<push arg="9"/>
			<call arg="10"/>
		</code>
		<linenumbertable>
			<lne id="11" begin="0" end="2"/>
			<lne id="12" begin="0" end="3"/>
			<lne id="13" begin="0" end="4"/>
			<lne id="14" begin="0" end="5"/>
			<lne id="15" begin="0" end="6"/>
			<lne id="16" begin="7" end="7"/>
			<lne id="17" begin="0" end="8"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="8"/>
		</localvariabletable>
	</operation>
	<operation name="19">
		<context type="20"/>
		<parameters>
		</parameters>
		<code>
			<push arg="21"/>
			<push arg="22"/>
			<store arg="23"/>
			<load arg="24"/>
			<get arg="25"/>
			<iterate/>
			<store arg="26"/>
			<load arg="23"/>
			<load arg="26"/>
			<call arg="27"/>
			<call arg="28"/>
			<push arg="29"/>
			<call arg="28"/>
			<store arg="23"/>
			<enditerate/>
			<load arg="23"/>
			<call arg="28"/>
		</code>
		<linenumbertable>
			<lne id="30" begin="0" end="0"/>
			<lne id="31" begin="1" end="1"/>
			<lne id="32" begin="3" end="3"/>
			<lne id="33" begin="3" end="4"/>
			<lne id="34" begin="7" end="7"/>
			<lne id="35" begin="8" end="8"/>
			<lne id="36" begin="8" end="9"/>
			<lne id="37" begin="7" end="10"/>
			<lne id="38" begin="11" end="11"/>
			<lne id="39" begin="7" end="12"/>
			<lne id="40" begin="1" end="15"/>
			<lne id="41" begin="0" end="16"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="42" begin="6" end="13"/>
			<lve slot="1" name="43" begin="2" end="15"/>
			<lve slot="0" name="18" begin="0" end="16"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="45"/>
		<parameters>
		</parameters>
		<code>
			<load arg="24"/>
			<get arg="46"/>
			<call arg="47"/>
			<store arg="23"/>
			<push arg="48"/>
			<load arg="24"/>
			<get arg="49"/>
			<call arg="28"/>
			<load arg="23"/>
			<pushi arg="24"/>
			<call arg="50"/>
			<if arg="51"/>
			<push arg="29"/>
			<goto arg="52"/>
			<push arg="53"/>
			<load arg="23"/>
			<call arg="54"/>
			<call arg="28"/>
			<push arg="55"/>
			<call arg="28"/>
			<call arg="28"/>
		</code>
		<linenumbertable>
			<lne id="56" begin="0" end="0"/>
			<lne id="57" begin="0" end="1"/>
			<lne id="58" begin="0" end="2"/>
			<lne id="59" begin="4" end="4"/>
			<lne id="60" begin="5" end="5"/>
			<lne id="61" begin="5" end="6"/>
			<lne id="62" begin="4" end="7"/>
			<lne id="63" begin="8" end="8"/>
			<lne id="64" begin="9" end="9"/>
			<lne id="65" begin="8" end="10"/>
			<lne id="66" begin="12" end="12"/>
			<lne id="67" begin="14" end="14"/>
			<lne id="68" begin="15" end="15"/>
			<lne id="69" begin="15" end="16"/>
			<lne id="70" begin="14" end="17"/>
			<lne id="71" begin="18" end="18"/>
			<lne id="72" begin="14" end="19"/>
			<lne id="73" begin="8" end="19"/>
			<lne id="74" begin="4" end="20"/>
			<lne id="75" begin="0" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="76" begin="3" end="20"/>
			<lve slot="0" name="18" begin="0" end="20"/>
		</localvariabletable>
	</operation>
</asm>
